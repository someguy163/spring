chp02 = DI 의존성 주입


chp03 = 제어의 역전


chap03_Ex_01 : 빈객체 연습문제 (Hello maven project!!) 출력하기


chap04_Ex_01

Iterator<String> iterator = keys.iterator();
반복하는 객체
iterator.hasNext()
자동으로 다음


Ex

		System.out.println("ArrayList");
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("a");
		cars.add("b");
		cars.add("c");
		cars.add("d");
		
//		Iterator<String> iterator = cars.iterator();
//		
//		while (iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//			
//		}
		
		for(String string : cars) {
			System.out.println(string);
		}

  출력 : a b c d


pom.xml : 메이븐 설정파일
필요한 라이브러리를 연결하고 빌드 설정을 담당함
