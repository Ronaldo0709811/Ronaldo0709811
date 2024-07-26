public class Window {
    public static void main(String[] args) {
        // 案例1 记录想吃的东西 利用Switch跟四个东西匹配
        String noodles = "兰州拉面";
        switch (noodles) {
            case "武汉拉面":
            System.out.println("吃武汉拉面");
            break;
            case "扬州拉面":
            System.out.println("吃扬州拉面");
            break;
            default:
            System.out.println("错误");

        }
    }
}

