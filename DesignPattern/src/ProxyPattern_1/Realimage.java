package ProxyPattern_1;
//realsubject
public class Realimage implements imageListView{
    
    private String imageName;
     
    public Realimage(String imageString) {
        this.imageName = imageString;
    }
     
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("이미지  로딩 : "+ imageName);
    }
     
    public void diskImage() {
        System.out.println("이미지 캐싱 : "+ imageName);
    }
 
}
