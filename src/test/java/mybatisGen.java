//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.OutputFile;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//
//import java.util.Collections;
//
//public class mybatisGen {
//
//    public static void main(String[] args) {
//        FastAutoGenerator.create("jdbc:mysql://192.168.5.111:3306/neo?useUnicode=true&characterEncoding=UTF-8",
//                        "root", "123456")
//                .globalConfig(builder -> {
//                    builder.author("neo") // 设置作者
//                            .fileOverride() // 覆盖已生成文件
//                            .outputDir("/Users/lina/IdeaProjects/SpringWeb/src/test/java/"); // 指定输出目录
//                })
//                .packageConfig(builder -> {
//                    builder.parent("org.example") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, "/Users/lina/IdeaProjects/SpringWeb/src/test/java/")); // 设置mapperXml生成路径
//                })
//                .strategyConfig(builder -> {
//                    builder.addInclude("neo_map"); // 设置需要生成的表名
//                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//                .execute();
//    }
//
//}
