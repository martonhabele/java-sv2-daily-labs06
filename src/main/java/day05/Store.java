package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<ProductByVolume> numberOfProductsByType() {
        List<ProductByVolume> list = new ArrayList<>();
        for (Product actual : products) {
            ProductByVolume productByVolume = containsProduct(actual, list);
            if (productByVolume != null) {
                productByVolume.incrementCount();
            }
            else {
                list.add(new ProductByVolume(actual.getType()));
            }
        }
        return list;
    }

    public ProductByVolume containsProduct(Product product, List<ProductByVolume> productByVolumeList) {
        for (ProductByVolume item : productByVolumeList) {
            if (item.getType() == product.getType()) {
                return item;
            }
        }
        return null;
    }
}