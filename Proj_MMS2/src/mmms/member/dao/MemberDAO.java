package mmms.member.dao;

import java.sql.Connection;
import java.util.ArrayList;

import mmms.member.vo.Member;

public class MemberDAO {
	Connection con;
	public MemberDAO(Connection con) {
		this.con = con;
	}
	//1.회원등록
	public int insertNewMember(Member newMember) {
		
		String sql = "insert~~~~";
		
		return 0;


	}
	//2.회원목록 보기
	public ArrayList<Member> getMemberList() {
		return null;
	}
	
	//3.회원정보 수정
public ArrayList<Member> selectMemberList() {


		return null;
		
	}

	
	//3.특정 회원 정보 보기

public Member selectOldMember(String name) {
	return null;
}
	//4.회원정보 수정
public int updateMember(Member updateMember) {
return 0;
}
	//5.회원정보 삭제
public int deleteMember(String name) {
	return 0;
}
}
