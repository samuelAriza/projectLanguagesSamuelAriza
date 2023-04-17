//Preprocessor directives:
/*definitions needed to interact with native code from java*/
#include <jni.h> 
#include "Lab1.h"//Lab1 class definitions
#include <iostream>//Definitions needed to work with standard I/O functions
using namespace std;
//Native function
JNIEXPORT jdouble JNICALL Java_Lab1_getArithmeticMean(JNIEnv *env, jobject, jintArray arrayOfNumbers){
  /*Get the length of the array passed as argument 
  of the function from Java*/
  jint length = env->GetArrayLength(arrayOfNumbers);
  //Obtain array elements
  jint *array = env->GetIntArrayElements(arrayOfNumbers, 0);
  /*Declare variable of type double to store 
  the sum of all the elements of the array.*/
  double add = 0;
  /*For to iterate over each element of the 
  array and add it to the add variable*/
  for(int i = 0; i < length; i++){
    add = add + array[i];
  }
  //Arithmetic mean
  double mean = add / length;
  //Screen by console and return mean
  cout << mean << endl;
  return mean;
}
