class Raindrops
  # @return [String]
  def self.convert(i)
    running = ""
    if i % 3 == 0
      running += "Pling" end
    if i % 5 == 0
      running += "Plang" end
    if i % 7 == 0
      running += "Plong" end
    if running == ""
      running += String(i) end
    running
  end
end