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


		Iterator<String> iterator = cars.iterator();
		System.out.println("ArrayList while문");
		System.out.println("--------------");
		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
		System.out.println("ArrayList for문");
		System.out.println("--------------");

		for(String string : cars) {
			System.out.println(string);
		}

		System.out.println("Set");
		System.out.println();
		Set<String> cars2 = new HashSet<>();

		cars2.add("A");
		cars2.add("B");
		cars2.add("C");
		cars2.add("D");

		Iterator<String> iterator2 = cars2.iterator();
		System.out.println("Set while문");
		System.out.println("--------------");
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
		System.out.println("Set for문");
		System.out.println("--------------");
		for(String str2 : cars2) {
			System.out.println(str2);
		}

		//컬렉션 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("while문을 지나기 전 리스트에 들어있던 값 : " + list);

		//리스트에 들어있는 값에 각각 '+' 붙이기
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "+");
		}
		System.out.println("while문 지난 후 수정된 결과 : "  + list);

		//리스트에 들어오는 값을 역순으로 표시
		System.out.println("역순 출력 결과 : "); 
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.println(element + " ");
		}

  


pom.xml : 메이븐 설정파일
필요한 라이브러리를 연결하고 빌드 설정을 담당함



applicationContext.xml에서

<bean id="initSampleData"
		class="ch04_pjt_01.ems.utils.InitSampleData">

		<property name="sNums">
			<array>
				<value>hbs001</value>
				<value>hbs002</value>
				<value>hbs003</value>
				<value>hbs004</value>
				<value>hbs005</value>
			</array>
		</property>

  class 경로에 저장된 필드값이 Array일경우 XML에서 위와같이 지정할수있다.
  property name을 통해서 필드명을 지정하고 value를 통해서 값을 넣어준다.

  클래스 파일에서 생성자가 dafualt 생성자가 아닌 매개변수를 받는 생성자가 있을경우에는

java.code

	public StudentModifyService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
 
  
applicationContext.xml
  	<bean id="studentModifyService"
		class="ch04_pjt_01.ems.member.service.StudentModifyService">
		<constructor-arg ref="studentDao" />
	</bean>
 constructor-arg 태그를 통해 ref에다 매개변수로 들어가는 bean id를 넣어주면된다
 
 아래와 같이 하면된다 

 	<bean id="studentModifyService"
		class="ch04_pjt_01.ems.member.service.StudentModifyService">
		<constructor-arg ref="studentDao" />
	</bean>


//bean , annotaion
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans.xsd 
	http://www.springframework.org/schema/context 
	http://www.springframework.org/schema/context/spring-context.xsd">
	<context:annotation-config />
</beans>

