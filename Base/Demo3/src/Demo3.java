//��̬��ϰ
public class Demo3 {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int i = 0;
		while (i < 100){
			Car c = carFactory();
			c.run();
			System.out.println(i);
			i++;
		}	
	}	
	
	
	public static Car carFactory() {
		int i = (int)Math.round(Math.random()*2);
		
		if (i == 0){
			return new Bmw("����x5","��ɫ");
		}
		else if (i == 1){
			return new Benz("����s600","��ɫ");
		}
		else if(i == 2) {
			return new Porsche("����","��ɫ");
		}
		else return new Benz("smart","��ɫ");
	}

}
