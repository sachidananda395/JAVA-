public class Nested_if {
 public static void main(String[] args) {
    int age=25;
    char gender='m';
    if(gender=='M'||gender=='m'){
    if(age>18)
    {
        System.out.println("eligible bachelor");
    }
    else
    {
        System.out.println(" not eligible bachelor"); 
    }
}
    else if(gender=='f'||gender=='F'){
        if(age>18)
        {
            System.out.println("eligible spinster");
        }
        else
        {
            System.out.println(" not eligible spinster"); 
        }
    }
}
}
    