package model;

import java.util.Calendar;

public class Project {
    
    private int id;
    private String name;
    private String description;
    private Calendar createdAt;
    private Calendar updatedAt;
    
    public Project(String name, String description, Calendar createdAt, Calendar updatedAt) {
      
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        
    }
    
    public Project(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getCreatedAt() {
        createdAt = Calendar.getInstance();
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = Calendar.getInstance();
    }

    public Calendar getUpdatedAt() {
        updatedAt = Calendar.getInstance();
        return updatedAt;
    }

    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = Calendar.getInstance();
    }
    
    @Override
    public String toString() {
        return  "  " + this.name + "  ";
    }
    
}
