package com.cat.java8;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {
    @Test
    public void toList() {
        Stream<Integer> s = Stream.of(1, 4, 6, 8);
        Collector<Integer, ?, List<Integer>> c = Collectors.toList();
        List<Integer> a = s.collect(c);
    }

    @Test
    public void toMap() {
        Stream<Integer> s = Stream.of(1, 4, 6, 8);
        Collector<Integer, ?, Map<Integer, Integer>> c = Collectors.toMap(i -> i, i -> i * 2);
        Map<Integer, Integer> a = s.collect(c);
    }




    //---------------------------------


    @Test
    public void testCollect() {

        //list stream 元素分组
        Map<String, List<Integer>> groupCollector = Stream.of(numArray).collect(Collectors.groupingBy(i -> i > 5 ? "大于5" : "小于5"));
        //list stream 元素join 连接成字符串
        String c = Stream.of(strArray).collect(Collectors.joining());
        String d = Stream.of(strArray).collect(Collectors.joining(","));
        String e = Stream.of(strArray).collect(Collectors.joining(",", "{", "}"));

        List<String> collect = list.stream().collect(Collectors.mapping(Node::getName, Collectors.toList()));
    }







        private static class Node  {
        private String theme ;
        private String type ;
        private String name ;

        public Node(String theme, String type, String name) {
            this.theme = theme;
            this.type = type;
            this.name = name;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    private List<Node> list;
    private Integer[] numArray = {1, 4, 6, 8};
    private String[] strArray = {"a", "b", "c"};
    {
        list = new ArrayList<>();
        list.add(new Node("inspection", "industry", "产品"));
        list.add(new Node("inspection", "industry", "化妆品"));
        list.add(new Node("opinion", "injury", "产品致伤"));
        list.add(new Node("opinion", "injury", "食品致伤"));
        list.add(new Node("opinion", "damage", "致伤病"));
        list.add(new Node("opinion", "damage", "致财产损失"));
    }


    /**
     * 多条件分组
     */
    @Test
    public void multiGroupBy() {
        Map<String, Map<String, List<String>>> collect = list.stream().collect(
                //按theme 分组
                Collectors.groupingBy(Node::getTheme,
                        //theme每个分组再次分组，按type分组
                        Collectors.groupingBy(Node::getType,
                                //分组元素收集为name
                                Collectors.mapping(Node::getName,
                                        Collectors.toList()))));

//        String s = JSON.toJSONString(collect);
    }



//    /**
//     * map排序
//     */
//    @Test
//    public void mapOrder() {
//        Map<String, Integer> wordCounts = new HashMap<>();
//        wordCounts.put("USA", 100);
//        wordCounts.put("jobs", 200);
//        wordCounts.put("software", 50);
//        wordCounts.put("technology", 70);
//        wordCounts.put("opportunity", 200);
//
//        //升序
//        Map<String, Integer> a = wordCounts.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        //降序
//        Map<String, Integer> b = wordCounts.entrySet().stream()
//                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        //升序
//        Map<String, Integer> c = wordCounts.entrySet().stream()
//                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        //降序
//        Map<String, Integer> d = wordCounts.entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//    }


}
