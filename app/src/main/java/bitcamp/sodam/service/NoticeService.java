package bitcamp.sodam.service;

import java.util.List;

import bitcamp.sodam.beans.Notice;

public interface NoticeService {
  List<Notice> list() throws Exception;
  void add(Notice notice) throws Exception;
  void update(Notice notice) throws Exception;
  void delete(String nno) throws Exception;
  Notice get(int nno) throws Exception;
}
