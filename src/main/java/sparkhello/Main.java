package sparkhello;

import static spark.Spark.*;

public class Main {
	public static void main(String[] args) {
		get("/", (req, res) -> "Hello World");
	}	
}
