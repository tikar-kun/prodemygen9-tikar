����   7 y  Evaluasi/Soal2Eval  java/lang/Object input Ljava/util/Scanner; <init> ()V Code
      java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable this LEvaluasi/Soal2Eval; uangAndi ()I	    ! " out Ljava/io/PrintStream; $ 'Masukan Jumlah Uang yang Andi miliki : 
 & ( ' java/io/PrintStream ) * println (Ljava/lang/String;)V
  , -  nextInt uangA I 
listBarang ()[[I 3 [I 5 Harga Kacamata : 
 & 7 8 * print : java/lang/StringBuilder
 < > = java/lang/String ? @ valueOf (I)Ljava/lang/String;
 9 B  * D  
 9 F G H append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 9 J K L toString ()Ljava/lang/String;
 & N )  P Harga Baju :  barang [[I i j StackMapTable R checkOut
  Y  
  [ 0 1 ] 
 Detail >  _  Kacamata : 
 9 a G b (I)Ljava/lang/StringBuilder; d  Baju :  f (Dana Tidak Mencukupi) h Pengeuaran Maksimal adalah :  uang mungkin m co beli value main ([Ljava/lang/String;)V
  
  s W  args [Ljava/lang/String; run 
SourceFile Soal2Eval.java !                 	   E     *� 
*� Y� � � �                                	   N     � #� %*� � +<�           
                   . /   0 1  	  r     �� 2Y�
Y"OYOY,OSY�
YOY'OY!OSL=� �� >� 4� 6>� #� � 9Y+2.� ;� AC� E� I� 6���޲ � M� @� ;� O� 6>� #� � 9Y+2.� ;� AC� E� I� 6���޲ � M���� � M+�       F     /  4  8  @  E  b  j  p  x  �  �  �  �  �  �   � !    4    �     / � Q R  1 � S /  B ( T /  � ( T /  U    � 4 V� � � � 
  W   	  A     �*� X<*� ZM
�
N66� �6� �,2.,2.`6� E-O�� � 9Y� ;� A\� E^� E,2.� `c� E,2.� `� I� %� %-O�� � 9Y� ;� Ae� E� I� %� � M���{���l6-Y:
�6	6� 
.6� 6�	��� � 9Yg� A� `� I� %�       f    %  & 
 '  (  *  +  , - - 3 . 9 / < 0 r 1 u 2 z 3 } 4 � 6 � + � * � 9 � : � ; � < � : � ? � @    f 
   �      � i /  
 � Q R   � j 3   � k /  - s l /   � S /   � T /  � A m /  �  n /  U   d 	�    V 2   � � V   V 2  !�    V 2   � �    V 2   2   	 o p  	   I     � Y� qL+� r�           C  D  E         t u     v    w    x