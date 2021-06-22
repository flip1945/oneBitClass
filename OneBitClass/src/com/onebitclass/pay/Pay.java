package com.onebitclass.pay;

public class Pay {
	
	// 싱글톤 패턴으로 구성
	static private Pay pay = new Pay();

	private Pay() {
			
	}
	
	public static Pay getInstance() {
		return pay;
	}
	
	// 수강료 지불
	public void payTuitionFee(String StudentId, String TeacherId, int fee) {
		// id를 기준으로 객체 정보 가져옴
		// 포인트 정보만 가져오면 됨
		
//		학색의 getMemberByName(id);
//		강사의 getMemberByName(id);
		
		// 강사
//		updateMemberPoint(id, point + fee);
		// 수강생
//		updateMemberPoint(id, point - fee);
	}
	
	private void updateMemberPoint(String id, int point) {
		// 해당 id의 point를 update
		// dao를 통해 point를 업데이트
	}
}
