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
		Triangle_types triangle = Triangle_types.nottriangle;
		if(c<a+b){
			if (b<a+c) {
				if (a<b+c) {
					if(a==b) {
						if(b==c){
							triangle=Triangle_types.equilateral;
							return triangle.toString();}}
					if(a==b) {
						triangle=Triangle_types.isosceles;
					}
					else if(b==c) {
						triangle=Triangle_types.isosceles;
					}
					else if(a==c) {
						triangle=Triangle_types.isosceles;}
					else {
						triangle=Triangle_types.scalene;
						return triangle.toString();
					}}}}
		return triangle.toString();
	}
}
