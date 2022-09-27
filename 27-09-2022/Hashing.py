'''
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 27/09/2022
    @ Problem Statement : A hash of the username is stored along with the post.
	The hash of a string is computed as the sum of the number of 1's in each byte
	of the string. Implement this hash function and display the hash of a username.
'''

class HashZoho:
	def binary(self,x):
		quot = x/2
		rem = ""
		while(quot!=0):
			quot = x//2
			Rem = x%2
			rem+=str(Rem)
			x = quot
		return rem

	def find(self,s):
		l = []
		for x in s:
			l.append(ord(x))
		for x in range(len(l)):
			l[x] = self.binary(l[x])
		s = 0
		for x in l:
			for y in x:
				if y=='1':
					s+=1
		print(s)

HashZoho().find("randomcoder")