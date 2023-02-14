import java.util.*;

public class VendingMachine {
    private final int sizeMachine;
    private final    String nameMachine;
    List<Product> productList;
    Map<String, Integer> products;

    VendingMachine(String nameMachine,int sizeMachine){
        this.nameMachine = nameMachine;
        this.sizeMachine = sizeMachine;
        products = new HashMap<>(sizeMachine);
        productList = new ArrayList<>(sizeMachine);
    }

    public int getSizeMachine() {
        return sizeMachine;
    }

    public String getNameMachine() {
        return nameMachine;
    }



    public List<Product> getProductsList(){
        return productList;
    }
    public String getProduct(String name){
        for (Product pr : productList
             ) {
                if(pr.getName().equals(name)){
                    return pr.getName() + " стоимость " +  pr.getPrice();
                }
        }
        return "такой продукт отсутвует";
    }

    public void addProducts(String nameProduct,double price, int count) {



        if(this.sizeMachine > products.size()){
            products.put(nameProduct,count);
            productList.add(new Product(nameProduct,price));
        }else {
            System.out.println("Is full");
        }
    }

    @Override
    public String toString(){
      return this.products.toString();
    }



}
