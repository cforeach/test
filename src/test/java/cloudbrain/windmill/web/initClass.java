package cloudbrain.windmill.web;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

/** 
* @author cforeach 
* @version 创建时间：2018年5月7日 下午3:12:26 
* 类说明 
*/
public class initClass extends AbstractVerticle{

  private static Vertx vertx=Vertx.vertx();
  
  public static void main(String[] args) {
    vertx.deployVerticle(ConnectionTest.class.getName());

  }
}
