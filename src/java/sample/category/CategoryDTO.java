/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.category;

/**
 *
 * @author OS
 */
public class CategoryDTO {
    private int cid;
    private String cname;
 public CategoryDTO(){}
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public CategoryDTO(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
   

    @Override
    public String toString() {
        return "CategoryDTO{" + "cid=" + cid + ", cname=" + cname + '}';
    }
    
}
