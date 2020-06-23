package ProxyPattern_1;
//client
public class Main {
	 public static void main(String[] args) {
         
	        imageListView image = new Proxyimage("file");
	        imageListView image1 = new Proxyimage("file1");
	         
	        image.draw();
	        image.draw();
	        image.draw();
	        image1.draw();
	        image1.draw();
	        image1.draw();
	         
	    }
}
