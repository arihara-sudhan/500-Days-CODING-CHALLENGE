=begin
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 15/09/2022
    @ Problem Statement: Given a signed 32-bit integer x, return x with its digits
        reversed. If reversing x causes the value to go outside the signed 32-bit
        integer range [-231, 231 - 1], then return 0. Assume the environment 
        does not allow you to store 64-bit integers (signed or unsigned).
    @ Example 1:
        Input: x = 123
        Output: 321
=end

def reverse(x)
    f = false
    if x<0
        f = true
        x = -x
    end
    rev = 0
    while x>0 do
        rev = rev*10+x.modulo(10)
        x = x/10
    end
    if f
        return -rev
    end
    return rev
end

puts(reverse(-122))
