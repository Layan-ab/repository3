package code_coverage_4.code_coverage_4;

public class Triangle_classifacation {
	enum Triangle_types{
		equilateral,
		isosceles,
		scalene,
		nottriangle,
		error
	}
	public static String classifyTriangle(int a, int b, int c) {
		Triangle_types triangle;
		if((c<a+b)&& (b<a+c)&&(a<b+c)) {
			if((a==b)&&(b==c)){
				triangle=Triangle_types.equilateral;
			}
			else if ((a==b)|| (b==c)||(a==c)){
				triangle=Triangle_types.isosceles;
			}
			else 
				triangle=Triangle_types.scalene;
		}
		else 
			triangle=Triangle_types.nottriangle;
		return triangle.toString();
	}
}
