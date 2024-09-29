package A_String;

public class Shortest_path_to_destination {
	public static void main(String[] args) {
		String direction = "WNEENESENNN";
		int x_axis = 0;
		int y_axis = 0;
		for(int i=0; i<direction.length(); i++) {
			if(direction.charAt(i) == 'E') {
				x_axis--;
			}
			else if(direction.charAt(i) == 'W') {
				x_axis++;
			}
			else if(direction.charAt(i) == 'N') {
				y_axis++;
			}
			else {
				y_axis--;
			}
		}
		int x_square = x_axis * x_axis;
		int y_square = y_axis * y_axis;
		System.out.println(Math.sqrt(x_square + y_square));
				
	}
}
