package tdd.mars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/8/20 23:31
 * @Description:
 * 假想你在火星探索团队中负责软件开发。现在你要给登陆火星的探索小车编写控制程序，根据地球发送的控制指令来控制火星车的行动。
 * 教学目标
 * 反复练习如何用测试框定需求范围
 * 反复练习如何拆解合理的任务列表
 * 反复练习测试驱动开发的节奏
 * 反复练习识别和消除代码坏味道
 * 初始需求:
 * 火星车收到的指令分为四类：
 * 探索区域信息：告知火星车，整片区域的长度（X）和宽度（Y）有多大；
 * 初始化信息：火星车的降落地点（x, y）和朝向（N, S, E, W）信息；
 * 移动指令：火星车可以前进（f）或后退（b）；
 * 转向指令：火星车可以左转90度（l）或右转90度（r）。
 * 由于地球和火星之间的距离很远，指令必须批量发送，火星车执行完整批指令之后，再回报自己所在的位置坐标和朝向。
 *
 * 扩展需求:
 * 下面是火星探索团队提出的其他一些需求：
 * 应该阻止小车跑到超出整片区域坐标系的地方去
 * 火星不是平的，而是球体，所以如果小车从坐标系的一边跑了出去，应该从另一边跑进来
 * 火星地面上有障碍物，如果火星车遇到了障碍物导致后续指令受阻，应该停留在原地，放弃执行后续指令，并立即向地球回报
 * 你需要自己判断，是否采纳这些需求。
 *
 */
public class MarsRoverTest {

    public MarsRover marsRover;

    @Before
    public void initMarsRover(){
        RoverCommand roverCommand = new RoverCommand();
        marsRover = new MarsRover(roverCommand);

    }

    @Test
    public void getFeedBack(){
        assertEquals("", marsRover.coordinate());
        assertEquals("", marsRover.orientation());
    }

    @Test
    public void getFeedBack_after_advance_or_retreat(){
        assertEquals("", marsRover.coordinate());
        assertEquals("", marsRover.orientation());
    }

    @Test
    public void getFeedBack_after_turn_left_or_right(){
        assertEquals("", marsRover.coordinate());
        assertEquals("", marsRover.orientation());
    }
}
