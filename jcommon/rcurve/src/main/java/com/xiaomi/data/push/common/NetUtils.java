package com.xiaomi.data.push.common;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.*;
import io.netty.channel.kqueue.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author goodjava@qq.com
 * @date 2022/7/18 11:27
 */
public class NetUtils {

    public static final String OS_NAME = System.getProperty("os.name");

    private static boolean isLinuxPlatform = false;

    static {
        if (OS_NAME != null && OS_NAME.toLowerCase().indexOf("linux") >= 0) {
            isLinuxPlatform = true;
        }
    }

    public static EventLoopGroup getEventLoopGroup(boolean remote) {
        if (remote) {
            if(useEpoll()) {
                return new EpollEventLoopGroup();
            } else {
                return new NioEventLoopGroup();
            }
        }
        if (CommonUtils.isWindows()) {
            return new NioEventLoopGroup();
        }
        return CommonUtils.isMac() ? new KQueueEventLoopGroup() : new EpollEventLoopGroup();
    }

    public static Class getServerChannelClass(boolean mac, boolean remote) {
        if (remote) {
            if (CommonUtils.isMac() && CommonUtils.isArch64()) {
                return NioServerSocketChannel.class;
            }
            if (CommonUtils.isWindows()) {
                return NioServerSocketChannel.class;
            }
            return mac ? KQueueServerSocketChannel.class : EpollServerSocketChannel.class;
        }
        return mac ? KQueueServerDomainSocketChannel.class : EpollServerDomainSocketChannel.class;
    }


    public static Class getClientChannelClass(boolean mac, boolean remote) {
        if (remote) {
            if (CommonUtils.isMac() && CommonUtils.isArch64()) {
                return NioSocketChannel.class;
            }
            if (CommonUtils.isWindows()) {
                return NioSocketChannel.class;
            }
            return mac ? KQueueSocketChannel.class : EpollSocketChannel.class;
        }
        return mac ? KQueueDomainSocketChannel.class : EpollDomainSocketChannel.class;
    }

    public static boolean useEpoll() {
        return isLinuxPlatform() && Epoll.isAvailable();
    }

    public static boolean isLinuxPlatform() {
        return isLinuxPlatform;
    }

}
