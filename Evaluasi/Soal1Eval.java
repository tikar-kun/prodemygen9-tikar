����   7 c  Evaluasi/Soal1Eval  java/lang/Object input Ljava/util/Scanner; arr [[I <init> ()V Code
   	 
  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
   	  (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable this LEvaluasi/Soal1Eval; getN ()I	  " # $ out Ljava/io/PrintStream; &  masukan panjang N : 
 ( * ) java/io/PrintStream + , println (Ljava/lang/String;)V
  . /   nextInt I isi (I)V 	  5   p isiA i j StackMapTable cetak
  =   
  ? 1 2 A java/lang/StringBuilder
 C E D java/lang/String F G valueOf (I)Ljava/lang/String;
 @ I 	 , K  
 @ M N O append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 @ Q R S toString ()Ljava/lang/String;
 ( U V , print
 ( X + 
 main ([Ljava/lang/String;)V
  
  ] ; 
 args [Ljava/lang/String; run 
SourceFile Soal1Eval.java !                   	 
     E     *� *� Y� � � �                                    N     � !%� '*� � -<�                               0   1 2         ^*� 3� 4=>� J� "6� *� 42O������ $� 6� ��*� 42O��������       >     
          %  (  1  9  ?  B  L  U  ]      >    ^       ^ 6 0   R 7 0   O 8 0    9 0  <  9 0  :    � � 	� � 
�   ; 
     �     K*� <<*� >=� 9>� &� !� @Y*� 42.� B� HJ� L� P� T���۲ !� W���ȱ       & 	   #  $ 
 %  &  ' 4 & < ) B % J +    *    K      F 6 0   > 8 0   + 9 0  :    � � "�  	 Y Z     I     � Y� [L+� \�           -  .  /         ^ _     `    a    b