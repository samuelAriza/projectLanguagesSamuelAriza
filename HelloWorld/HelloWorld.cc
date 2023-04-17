#include <jni.h>
#include <iostream>
#include "HelloWorld.h"
using namespace std;

JNIEXPORT void JNICALL Java_HelloWorld_print (JNIEnv *, jobject){
    cout << "Hello World from C++";
}