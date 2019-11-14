package circle;
public class With {
    float radius;
    With(float radius )
        {
           this.radius = radius;
        }
    With()
        {
           this.radius = 10;
        }
        void Area(){
            float area= (float) (3.14*radius*radius);
            System.out.println("Area of Circle:"+area);
            float pera = (float) (2*3.14*radius);
            System.out.println("Peramiter of Circle:"+pera);
        }
        /* public void finalize() 
            { 
                System.out.println("Destructor is done");  
            } */
    
}

