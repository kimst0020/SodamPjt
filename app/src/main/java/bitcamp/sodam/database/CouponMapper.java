package bitcamp.sodam.database;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import bitcamp.sodam.beans.Coupon;

public interface CouponMapper {
	
	@Select("select mc.mcuno, mc.uno, d.cuname, d.cuprice, d.cuexp, mc.mcudt, d.cuint , mc.mcu_status "
			+ "from tmk_my_coupon mc "
			+ "inner join tmk_discount d on mc.cuno = d.cuno "
			+ "inner join tmk_user u on mc.uno = u.uno "
			+ "where u.uno = #{uno} "
			+ "order by mcu_status, mcudt"
			)
    List<Coupon> findCouponList(int uno);
	
	@Select("select c.mcuno, c.uno, c.cuno, c.mcudt, c.mcu_status, u.name, u.email, d.cuname, d.cuint, d.cuprice from tmk_my_coupon c join tmk_user u on c.uno = u.uno join tmk_discount d on c.cuno = d.cuno")
    List<Coupon> findAllCouponList();
	
	@Delete("DELETE FROM tmk_my_coupon WHERE mcuno = #{mcuno}")
    void delete(int mcuno);

}