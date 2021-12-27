package day03;

import java.io.Serializable;
//目的是为了实现序列化 与反序列化 也就是输入到硬盘；输出到内存
 class Dog implements Serializable {
     //序列化的版本号 可以提高兼容性 增加属性也不会报错
private static final   long serializaVersionId =1l;
    private String name;
    private int age;

    public static String getHobby() {
        return hobby;
    }

    public static void setHobby(String hobby) {
        Dog.hobby = hobby;
    }

    private static String hobby;

    public Dog(String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby=hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +hobby+
                '}';
    }
}
