#include <jni.h>
#include <iostream>
#include "AddNumbers.h"
using namespace std;

JNIEXPORT jint JNICALL Java_AddNumbers_addNumbers (JNIEnv *, jobject, jint first, jint second){
    int add = first + second;
    cout << "La suma de " << first << " + " << second << " es: " << add;
    return add;
}