import java.util.ArrayList;
import java.util.List;

class Product{
    private final int ProductId;
    private final String ProductName;
    private final String category;
    public Product(int productId,String ProductName,String category){
        this.ProductId=productId;
        this.ProductName=ProductName;
        this.category=category;
    }
    public int getProductId(){
        return ProductId;
    }
    public String getProductName(){
        return ProductName;
    }
    public String getcategory(){
        return category;
    }
}
public class ECommerceSearch {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        Product product1=new Product(101,"laptop","Electronics");
        list.add(product1);

        Product product2 = new Product(102, "ipad", "Electronics");
        list.add(product2);

        Product product3 = new Product(103,"SmartWatch","Electronics");
        list.add(product3);

        for(int i=0;i<list.size();i=i+1){
            Product current = list.get(i);
            if(current.getProductName().equals("laptop")){
              System.out.println("Product name is found.");
            }
        }
        int start=0;
        int end=list.size()-1;
        int targetid=103;
        boolean find=true;
        while(start<=end){
            int mid=start+(end-start)/2;
            Product current = list.get(mid);
            if(current.getProductId()==targetid){
                System.out.println("ProductId is found");
                find=false;
                break;
            }
            else if(current.getProductId()<targetid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(find){
            System.out.println("ProducId not found");
        }
    }
}
