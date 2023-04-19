public class Rectangle{
  private int width;
  private int height;
  
  public Rectangle(rectWidth, rectHeight){
    width = rectWidth;
    height = rectHeight;
  }
  
  public int getArea(){
    return width * height;
  }
    
  public int getWidth(){
    return width;
  }
  
  public int getHeight(){
    return height;
  }
    
  public String toString(){
    return "Rectangle with width " + width + " and height " + height;
  }
