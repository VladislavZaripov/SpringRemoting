import configuration.DataServiceConfig;
import entity.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import service.SingerService;

import java.util.List;

public class Executor {

    public static void main(String[] args) throws InterruptedException {

        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(DataServiceConfig.class);

        SingerService singerService = ctx.getBean(SingerService.class);

        listSingers(singerService.findAll());
    }

    public static void listSingers(List<Singer> singers) {
        for (Singer singer : singers)
            System.out.println(singer.toString());
    }
}
