package shieryue12.Dec_06;

/**
 * 如果要对40亿QQ号进行去重 1G
 *
 * 使用位桶，对于1个字节，8位，可以表示0-7 8个数是否存在  比如255 即 1111 1110 表示1-7都存在，0不存在
 * 1111 1111 1111 1110 表示1-15都存在，0不存在 1111 1111 1111 1111   1111 1111 1111 1110 表示1-31都存在，0不存在
 * 1个byte是1个字节，8位，第一个byte表示0-31是否存在，第二个字节表示32-63是否存在，...，
 * 第2的29次方个字节表示（2的29次方减1）*32 到（2的29次方减1）*32+31是否存在
 * 建立一个2的29次方大小的byte数组，遍历所有int值（0到2的32次方-1），
 * 那么4个字节可以表示0-15，如果要表示2的32次方-1，那么需要2的29次方个字节 大概需要1024*1024*512 即512MB
 *
 * @author Hs
 * @Date 2021/12/6 13:46
 */
public class TestBit {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        System.out.println(s.substring(0, s.indexOf("", 3)));
    }
}
