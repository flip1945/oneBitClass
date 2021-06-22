package com.onebitclass.user;

import java.util.ArrayList;

import com.onebitclass.util.InputReader;

public class User {
	
	public void showClasses() {
		
		InputReader ir = new InputReader();
		int select = ir.readInteger();
		
		selectClassesMenu(select);
	}
	
	private void selectClassesMenu(int select) {
		switch (select) {
			case 1:
				// 1. 지금 할인 중인 강좌
				showDiscountClasses();
			break;
			case 2:
				// 2. 마감 임박 강좌
				showDeadlineClasses();
			break;
			case 3:
				// 3. 내 지역 근처 강좌
				showLocalClasses();
			break;
			case 4:
				// 4. 분류별로 보기
				showClassification();
			break;
			case 0:
				// 0. 홈으로가기
			break;
			default:
				System.out.println("올바른 숫자를 입력하세요.");
			break;
		}
	}
	
	// 할인 중인 강좌 보기
	private void showDiscountClasses() {
		// dao로 강좌 리스트 받아오기
		// 할인 중인 강좌를 할인 순으로 정렬
		
//		ArrayList<Class> classes = getClasses();
//		for (Class c : classes) {
//			System.out.println(Class);
//		}
		
//		selectClass(classes);
	}
	
	// 마감임박 강좌 보기
	private void showDeadlineClasses() {
		// dao로 강좌 리스트 받아오기
		// 마감 임박인 강좌를 마감이 남은 일자가 작은 순으로 정렬
		
//		ArrayList<Class> classes = getClasses();
//		for (Class c : classes) {
//			System.out.println(Class);
//		}
		
//		selectClass(classes);
	}
	
	// 내 관심지역 강좌 보기
	private void showLocalClasses() {
		// dao로 강좌 리스트 받아오기
		// 자신의 관심지역과 같은 지역을 가나다 순으로 정렬
		
//		ArrayList<Class> classes = getClasses();
//		for (Class c : classes) {
//			System.out.println(Class);
//		}
		
//		selectClass(classes);
	}
	
	// 분류 보기
	private void showClassification() {
		// dao로 분류 정보 받기
		ArrayList<String> classification = new ArrayList<String>();
		
		for (int i = 0; i < classification.size(); i++) {
			System.out.println(i + 1 + "번. " + classification.get(i));
		}
		System.out.println();
	}
	
	// 강좌 선택하기
	private void selectClass(ArrayList<Class> classes) {
		InputReader ir = new InputReader();
		int select = ir.readInteger();
		
		// 강좌 객체를 생성하고, 강좌 내용을 dao를 통해 가져옴
		// 강좌 객체 가져와서 화면에 보여주기
		// 강좌 제목, 내용, 수강 인원, 일정, 리뷰 등 
//		get
	}
}
