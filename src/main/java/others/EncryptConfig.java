package others;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @author liangzhijie
 * @version 1.0
 * 探讨properties加密废案
 **/

@Slf4j
@Component
@Order(1)
public class EncryptConfig implements CommandLineRunner {

    /**
     * 路径优先级：前面的路径找到配置文件就不会再找后面路径
     */
    // private static final String[] DEFAULT_SEARCH_LOCATIONS = {"file:/config/", "file:/", "/"};
    //
    // private static final String DESKEY = "ctjSoft1";
    //
    @Override
    public void run(String... args) throws Exception {
    //     DES des = new DES(Mode.ECB, Padding.PKCS5Padding, DESKEY.getBytes());
    //     for (String loacation : DEFAULT_SEARCH_LOCATIONS) {
    //         InputStream in = null;
    //         OutputStream out = null;
    //         Properties prop = new Properties();
    //         File[] files;
    //         try {
    //             if (loacation.startsWith("file:")) {
    //                 loacation = loacation.replace("file:", System.getProperty("user.dir"));
    //                 // 程序包外面的用文件流来读取
    //                 File dir = new File(loacation);
    //                 files = dir.listFiles();
    //             } else {
    //                 ClassLoader classLoader = others.EncryptConfig.class.getClassLoader();
    //                 URL url = classLoader.getResource("");
    //                 String folderPath = url.getPath();
    //                 File folder = new File(folderPath);
    //                 files = folder.listFiles();
    //             }
    //             if (ListUtils.isArrayEmpty(files)) {
    //                 continue;
    //             }
    //             for (File file : files) {
    //                 if (file.getName().endsWith(".properties")) {
    //                     in = Files.newInputStream(file.toPath());
    //                     prop.load(in);
    //                     log.info("当前配置文件路径为:{}", file.getPath());
    //                     ResourceBundle rb = ResourceBundle.getBundle(file.getPath());
    //                     for (String key : rb.keySet()) {
    //                         try {
    //                             if (key.contains("pwd") || key.contains("password") || key.contains("Passwd") || key.contains("PW")) {
    //                                 // 首先尝试解密，如果能够解密成功，则不进行加密
    //                                 String oriValue = prop.getProperty(key);
    //                                 des.decryptStr(oriValue);
    //                             }
    //                         } catch (CryptoException e) {
    //                             // 当前配置不可被解密，故需要加密。
    //                             String enValue = des.encryptBase64(prop.getProperty(key));
    //                             prop.setProperty(key, enValue);
    //                         }
    //                     }
    //                     out = Files.newOutputStream(file.toPath());
    //                     prop.store(out, "");
    //                 }
    //             }
    //         } catch (Exception e) {
    //             log.error("校验配置文件密码配置失败", e);
    //             throw new RuntimeException("校验配置文件密码配置失败", e);
    //         } finally {
    //             IOUtils.closeQuietly(in);
    //             IOUtils.closeQuietly(out);
    //         }
    //     }
    }
}

