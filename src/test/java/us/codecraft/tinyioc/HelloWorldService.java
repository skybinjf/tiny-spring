package us.codecraft.tinyioc;

/**
 * service
 *
 * @author Sky
 * @Date 2021-03-23 17:08.
 */
public class HelloWorldService {

    private String text;

    public void helloWorld() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
