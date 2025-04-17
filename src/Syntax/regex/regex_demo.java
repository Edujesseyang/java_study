package src.Syntax.regex;

public class regex_demo {
    public static void main(String[] args) {
        String myPassword = "Jc_2951526";
        System.out.println(checkPassword(myPassword));

        String yourPassword = " JJcc__2951526";
        System.out.println(checkPassword(yourPassword));

        // use regex:
        String myAcc = "123456789";
        System.out.println(checkAccount(myAcc));

        String yourAcc = "1252525265545";
        System.out.println(checkAccount(yourAcc));

        // split string by regex
        String target = "you are a man, Jesse, your name is yang? 5555555 NO Way!";
        String[] arrStr = target.split("Jesse|yang");
        for (String sub : arrStr) {
            System.out.println(sub);
        }
        String arrStr2 = target.replaceAll("Jesse", "Lucky");
        String arrStr3 = arrStr2.replaceAll("yang", "Wang");
        System.out.println(arrStr3);


    }

    public static boolean checkPassword(String password) {
        if (password == null) {
            System.out.println("Password is null");
            return false;
        }
        // 1. 7 - 16 digits
        if (password.length() < 7 || password.length() > 16) {
            System.out.println("Invalid length!");
            return false;
        }
        // 2. at least 2 numbers, 2 lower cases, 2 upper cases. 2 special char(~!@#$%^&*_)
        int numCount = 0;
        int lower = 0;
        int upper = 0;
        int specialChar = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 48 && c <= 57) {
                numCount++;
            } else if (c >= 65 && c <= 90) {
                upper++;
            } else if (c >= 97 && c <= 122) {
                lower++;
            } else if (c == '~' || c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '_') {
                specialChar++;
            }
        }
        return numCount >= 2 && lower >= 2 && upper >= 2 && specialChar >= 2;
    }

    public static boolean checkAccount(String account) {
        // the account has to be 7-12; all numbers.
        return account != null && account.matches("\\d{7,12}");
    }

    // use regex to re-write checkPassword
    public static boolean checkPassword_regex(String password) {
        if (password == null) {
            System.out.println("Password is null");
            return false;
        }

        // 1. 7 - 16 digits
        if (password.length() < 7 || password.length() > 16) {
            System.out.println("Invalid length!");
            return false;
        }

        // 2. at least 2 numbers, 2 lower cases, 2 upper cases, 2 special chars (~!@#$%^&*_)
        String regex = "^(?=(.*\\d){2})(?=(.*[a-z]){2})(?=(.*[A-Z]){2})(?=(.*[~!@#$%^&*]){2}).{7,16}$";
        if (!password.matches(regex)) {
            System.out.println("Password does not meet the criteria!");
            return false;
        }

        return true;
    }

    /*正则表达式（Regular Expressions，简称 regex）是一种用于匹配字符串的模式。
    在编程语言中，正则表达式被广泛用于文本处理，如搜索、替换和验证。以下是正则表达式的全部语法及其解释：

    基本字符匹配
    字面量字符：直接匹配字符本身，如 a 匹配字母 a。
            .：匹配除换行符以外的任意单个字符。
    字符类
            [abc]：匹配 a、b 或 c 中的任意一个字符。
            [^abc]：匹配不在 a、b 或 c 中的任意字符（即取反）。
            [a-z]：匹配从 a 到 z 的任意小写字母。
            [A-Z]：匹配从 A 到 Z 的任意大写字母。
            [0-9]：匹配从 0 到 9 的任意数字。
            [a-zA-Z0-9_]：匹配任意字母、数字或下划线字符。
    预定义字符类
            \d：匹配任意数字字符，等价于 [0-9]。
            \D：匹配任意非数字字符，等价于 [^0-9]。
            \w：匹配任意字母、数字或下划线字符，等价于 [a-zA-Z0-9_]。
            \W：匹配任意非字母、非数字或非下划线字符，等价于 [^a-zA-Z0-9_]。
            \s：匹配任意空白字符（包括空格、制表符、换行符等）。
            \S：匹配任意非空白字符。
    边界匹配
            ^：匹配字符串的开始。
            $：匹配字符串的结尾。
            \b：匹配单词边界（如空格或标点符号）。
            \B：匹配非单词边界。
    量词（重复）
            X*：匹配前一个字符 0 次或多次（即任意次）。
            X+：匹配前一个字符 1 次或多次。
            X?：匹配前一个字符 0 次或 1 次（即要么不出现，要么出现一次）。
            X{n}：匹配前一个字符恰好 n 次。
            X{n,}：匹配前一个字符至少 n 次。
            X{n,m}：匹配前一个字符至少 n 次，至多 m 次。
    贪婪与非贪婪匹配
        贪婪匹配：默认情况下，量词是贪婪的，即尽可能多地匹配字符。例如，.* 会尽可能多地匹配字符。
        非贪婪匹配：通过在量词后面加上 ? 实现非贪婪匹配，即尽可能少地匹配字符。例如，.*? 会尽可能少地匹配字符。
    分组与捕获
            ()：将括号内的表达式视为一个整体，可以捕获匹配的内容，用于提取子串或应用量词。例如，(abc)+ 匹配一个或多个 abc。
            (?:...)：非捕获分组，仅用于分组，不捕获匹配的内容。
    反向引用
        \1, \2, ...：引用前面捕获的分组内容。例如，(\d)\1 匹配两个相同的数字。
    选择
        |：匹配 | 左边或右边的表达式。例如，abc|def 匹配 abc 或 def。
    转义字符
        \：用于转义特殊字符，使其作为普通字符使用。例如，\. 匹配 . 字符，而不是作为通配符。
    常用示例
        ^\d{3}-\d{2}-\d{4}$：匹配一个标准的美国社会安全号码（如 123-45-6789）。
        ^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$：匹配一个电子邮件地址。
    这些是正则表达式的基本语法和功能，通过组合和应用这些语法，你可以构建非常复杂和强大的字符串匹配模式。

     */

}
