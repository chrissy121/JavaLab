package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {

      if (this.name.equals(null)) {
          try {

          } catch (Exception e) {

        }
      } else {
          this.name = name;
      }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
