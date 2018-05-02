package cn.poaaapa.taskRun;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class TaskRunAction {


    /**
     * 获取网页数据
     */
    public String getDocByUrl(String url_input){

        String doc="" ;
        try {
            URL url = new URL(url_input);
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
            String line= "";
            while((line= in.readLine())!=null) {
                doc += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    public Document getDocByUrl2(String url_input){
        Document doc =null;
        HttpGet getMethod = new HttpGet(url_input);
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"OK");
        HttpClient client = new DefaultHttpClient();
        try {
            response = client.execute(getMethod);
            if(response.getStatusLine().getStatusCode()==200){
                String entity = EntityUtils.toString(response.getEntity(),"UTF-8");
                doc = Jsoup.parse(entity);
                EntityUtils.consume(response.getEntity());
            }else {
                EntityUtils.consume(response.getEntity());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }


    /**
     * 解析网页信息
     */
    public Map<String,String> Doc2Map(Document doc){

        return new HashMap<String,String>();
    }


    /**
     * 写入表格
     */
    public void write2XSL(Map<String,String> map){

    }




    public static void main(String arg[]){
        TaskRunAction tsa = new TaskRunAction();
        System.out.print( tsa.getDocByUrl2("https://www.jd.com"));
    }
}
