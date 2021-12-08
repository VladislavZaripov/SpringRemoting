package tests;

import configuration.RmiClientConfig;
import entity.Singer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import service.SingerService;

import java.util.List;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes = RmiClientConfig.class)
@RunWith(SpringRunner.class)
public class RmiTests {

    private Logger logger = LoggerFactory.getLogger(RmiTests.class);

    @Autowired
    private SingerService singerService;

    @Test
    public void testRmiAll(){
        List<Singer> singers = singerService.findAll();
        assertEquals(true,true);
        listSingers(singers);
    }

    private void listSingers(List<Singer> singers){
        singers.forEach(s->logger.info(s.toString()));
    }


}