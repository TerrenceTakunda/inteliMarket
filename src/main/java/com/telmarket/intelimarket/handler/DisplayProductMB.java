/*
 * Terrence Takunda Munyunguma [https://github.com/TerrenceTakunda]
 *  Copyright (C) 2018 ttmunyunguma@gmail.com
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.telmarket.intelimarket.handler;

import com.telmarket.intelimarket.Store.SearchProduct;
import com.telmarket.intelimarket.dao.ListDao;
import com.telmarket.intelimarket.entity.Product;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author terrence
 */
@ManagedBean
@Named(value = "displayProductMB")
@SessionScoped
public class DisplayProductMB implements Serializable {

    /**
     * Creates a new instance of DisplayProductMB
     */
    Product product = new Product();
    private Product selectedProduct;
    private String subcatname;
    private int searchResultsSize;
    private int allProductsSize;
    
    @ManagedProperty(value="#{searchProduct}")
    private SearchProduct queryProduct;
    
    public DisplayProductMB() {
    }

    public int getAllProductsSize() {
        return allProductsSize;
    }

    public void setAllProductsSize(int allProductsSize) {
        this.allProductsSize = allProductsSize;
    }

    public int getSearchResultsSize() {
        return searchResultsSize;
    }

    public SearchProduct getQueryProduct() {
        return queryProduct;
    }

    public void setQueryProduct(SearchProduct queryProduct) {
        this.queryProduct = queryProduct;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public String getSubcatname() {
        return subcatname;
    }

    public void setSubcatname(String subcatname) {
        this.subcatname = subcatname;
    }
    
    public List<Product> getAllProducts(){
        List<Product> pList = new ListDao().allProductsList();
        allProductsSize = pList.size();
        return pList;
    }
    
    public List<Product> productsBySubCat(){
    
        List<Product> pList = new ListDao().productListBySubCat(subcatname);
        return pList;    
    }
    
    public List<Product> getSearchedProducts(){
        List<Product> pList = new ListDao().searchProductList(queryProduct.getKeyword());
        searchResultsSize = pList.size();
        return pList;
    }
    
    public List<Product> getRandomProducts(){
        return new ListDao().findRandomSix();
    }
    
    public List<Product> getRandomFourProducts(){
        return new ListDao().findRandomFour();
    }
}
