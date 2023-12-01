package model;

public class Post {
    private long id;
    private String discription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", discription='" + discription + '\'' +
                '}';
    }
}

