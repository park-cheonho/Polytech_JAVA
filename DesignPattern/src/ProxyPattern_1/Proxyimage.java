package ProxyPattern_1;
//proxy
public class Proxyimage implements imageListView {
    
    private Realimage image;
    private String imageName;
     
    public Proxyimage(String imageName) {
        this.imageName= imageName;
    }
     
    @Override
    public void draw() {
        if(image == null) {//디스크에 이미지가 없으면 로딩하기
            image = new Realimage(imageName);
            image.draw();
        }
        else image.diskImage();
    }
 
}
