#coding:utf-8
cString = "abcdefghijklmnopqrstuvwxyz,.' ".split('');

original = "your time is limited, so don't waste it living someone else's life. don't be trapped by dogma, which is living with the results of other people's thinking. don't let the noise of others' opinions drown out your own inner voice. and most important, have the courage to follow your heart and intuition. they somehow already know what you truly want to become. everything else is secondary.".split('')

caesar = ""
puts num = 11#rand(29)+1

for i in 0..original.length-1 do
  for j in 0..cString.length-1 do
    if original[i]==cString[j] then
      caesar += cString[(j+num)%30]
    end
  end
end

puts caesar
