package com.geekbrains.Spring_Boot_DZ_.repositories;

import com.geekbrains.Spring_Boot_DZ_.entites.Product;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //для создания бина (обекта класса)
public class ProductRepository {

    public List<Product> listproduct = new ArrayList<>();

    public List<Product> getListproduct() {
        return listproduct;
    }



    // добавляем продукт
public void addProduct(Product prod){
        listproduct.add(prod);
}


// поиск по id
    public Product forIdListProduct(int id){

        for (Product list : listproduct) {
           if (list.getId() ==id) {
                System.out.println(String.valueOf(list));
                return list;
            }
        }

return new Product();
    }


}
