#Android.mk
LOCAL_PATH := $(call my-dir)

#自己的编译模块
include $(CLEAR_VARS)
LOCAL_MODULE    := a770_gpio
LOCAL_SRC_FILES := A770Gpio.cpp
LOCAL_LDLIBS    += -L$(SYSROOT)/lib -llog
LOCAL_CFLAGS    := -g

include $(BUILD_SHARED_LIBRARY)
