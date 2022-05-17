package hedspi.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    // This is constructor methods
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category) {
        this(title);
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this(title,category);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director);
        this.length = length;
        this.cost = cost;
    }
    public static String standardlizeString(String st) {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        return st;
    }
    public boolean search(String title){
        if(title==null) return false;
        else{
            //
            title=standardlizeString(title);
            String[] arrString=title.split(" ");

            //
            String copyTitle=new String(this.title);
            copyTitle=standardlizeString(copyTitle);
            String[] compareArrString=copyTitle.split(" ");

            for(int i=0;i<compareArrString.length;i++){
                for (int j=0;j<arrString.length;j++){
                    if(compareArrString[i].equals(arrString[j])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
