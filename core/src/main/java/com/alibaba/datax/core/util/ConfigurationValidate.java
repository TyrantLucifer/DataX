package com.alibaba.datax.core.util;

import com.alibaba.datax.common.util.Configuration;
import org.apache.commons.lang.Validate;

/**
 * Created by jingxing on 14-9-16.
 * <p>
 * 对配置文件做整体检查
 */
public class ConfigurationValidate {
    public static void doValidate(Configuration allConfig) {
        // 校验配置是否为空
        Validate.isTrue(allConfig != null, "");
        // 校验core配置
        coreValidate(allConfig);
        // 校验plugin配置
        pluginValidate(allConfig);
        // 校验job配置
        jobValidate(allConfig);
    }

    private static void coreValidate(Configuration allconfig) {
        return;
    }

    private static void pluginValidate(Configuration allConfig) {
        return;
    }

    private static void jobValidate(Configuration allConfig) {
        return;
    }
}
