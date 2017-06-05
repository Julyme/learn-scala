package samples

import org.junit._
import Assert._
import com.learnscala.chapter2.Practice

@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)

//    @Test
//    def testKO() = assertTrue(false)

    @Test
    def testPractice2{
    	val p = new com.learnscala.chapter2.Practice
	  	p.signum(11)
    }
}


