package com.baidu.beidou.navi.pbrpc.client.ha;

import java.util.List;

import com.baidu.beidou.navi.pbrpc.client.PbrpcClient;

/**
 * 在{@link LoadBalanceStrategy}中使用，用作调用成功、失败的默认回调
 *
 * @author zhangxu
 */
public class DefaultTransportCallback implements TransportCallback {

    /**
     * 客户端调用成功后的回调，默认什么都不做
     *
     * @param currClient 当前调用成功的客户端引用
     * @param clientList 当前整个{@link com.baidu.beidou.navi.pbrpc.client.HAPbrpcClient}托管的客户端列表
     */
    @Override
    public void onSuccess(PbrpcClient currClient, List<PbrpcClient> clientList) {

    }

    /**
     * 客户端调用失败后的回调，默认什么都不做
     *
     * @param currClient 当前调用成功的客户端引用
     * @param clientList 当前整个{@link com.baidu.beidou.navi.pbrpc.client.HAPbrpcClient}托管的客户端列表
     * @param e          调用错误异常
     */
    @Override
    public void onFail(PbrpcClient currClient, List<PbrpcClient> clientList, Exception e) {

    }
}
